package nl.tue.ddss.mvdxml1dot1.rule_operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.bimserver.emf.IdEObject;

import de.rwth_aachen.dc.mvd.events.CheckerShortNotificationEvent;
import fi.aalto.drumbeat.DrumbeatUserManager.events.EventBusCommunication;

public class InEqualOperator {
	private final String userId;
    private EventBusCommunication communication = EventBusCommunication.getInstance();

	// fields
	private Object leftOperand;
	private Object rightOperand;

	// constructors
	public InEqualOperator(String userId) {
		this.userId = userId;
	}

	public InEqualOperator(String userId,Object leftOperand, Object rightOperand) {
		this.userId = userId;
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	// methods
	public Object getLeftOperand() {
		return leftOperand;
	}

	public void setLeftOperand(Object leftOperand) {
		this.leftOperand = leftOperand;
	}

	public Object getRightOperand() {
		return rightOperand;
	}

	public void setRightOperand(Object rightOperand) {
		this.rightOperand = rightOperand;
	}

	public Boolean getResult() {
		Boolean result = new Boolean(false);
		if (rightOperand instanceof String) {
			if (((String) rightOperand).startsWith("reg")) {
				String reg = ((String) rightOperand).substring(4);
				if (leftOperand instanceof String) {
					if (Pattern.matches(reg,(String)leftOperand)){
						result = false;
					} else {
						result = true;
					}
				} else
					result = true;
			} else {
				if (leftOperand instanceof String) {
					if (leftOperand.equals(rightOperand)) {
						result = false;
					} else {
						result = true;
					}
				} else if (leftOperand instanceof IdEObject) {
					String typeName = leftOperand.getClass().getSimpleName();
					typeName = typeName.substring(0, typeName.length() - 4);
					if (typeName.equals(rightOperand)) {
						result = false;
					} else {
						result = true;
					}
				} else if (leftOperand instanceof Collection) {
					List<Object> valueList = new ArrayList<Object>();
					valueList.addAll((Collection<?>) leftOperand);
					for (int i = 0; i < valueList.size(); i++) {
						if (valueList.get(i) instanceof String) {
							if (!valueList.get(i).equals(rightOperand)) {
								result = true;
								break;
							}
							if (valueList.get(i).equals(rightOperand)
									&& i == valueList.size() - 1) {
								result = false;
							}
						} else if (valueList.get(i) instanceof IdEObject) {
							String typeName = valueList.get(i).getClass()
									.getSimpleName();
							typeName = typeName.substring(0,
									typeName.length() - 4);
							if (!typeName.equals(rightOperand)) {
								result = true;
								break;
							}
							if (typeName.equals(rightOperand)
									&& i == valueList.size() - 1) {
								result = false;
							}
						} else
							result = true;
					}
				} else {
					result = true;
				}
			}
		} else if (rightOperand instanceof Double) {
			if (leftOperand instanceof Double) {
				if (leftOperand.equals(rightOperand))
					result = false;
				else
					result = true;
			} else if (leftOperand instanceof Integer) {
				int left=((Integer)leftOperand).intValue();
				Double doub=new Double(left);
				if (doub.equals(rightOperand))
					result = false;
				else
					result = true;
			}
			 {
				try
				{
				if(rightOperand.equals(Double.parseDouble(leftOperand+"")))
				    return false;
				else
				    return true;
				}
				catch (NumberFormatException e) {
				    return false;
				}
			    }
		} else if (rightOperand instanceof IdEObject) {
			if (leftOperand instanceof IdEObject) {
				String typeName = leftOperand.getClass().getSimpleName();
				typeName = typeName.substring(0, typeName.length() - 4);
				if (typeName == rightOperand) {
					result = false;
				} else {
					result = true;
				}
			}
			else
			//System.out.println("To be later supported");
			result = false;
		} else if (rightOperand instanceof Collection) {
			//System.out.println("To be later supported");
			result = false;
		}
		
		if(result==false)
		{
			communication.post(new CheckerShortNotificationEvent(this.userId,"( <B style=\"color:red\"> \""+leftOperand+ "\" NOT <> \"" + rightOperand+"\"</B> )"));
		}
		else
		{
			communication.post(new CheckerShortNotificationEvent(this.userId,"( <B style=\"color:green\"> \""+leftOperand+ "\" <> \"" + rightOperand+"\"</B> )"));
		}
		return result;
	}
}