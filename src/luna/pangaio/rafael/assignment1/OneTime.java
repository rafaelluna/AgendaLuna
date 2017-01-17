package luna.pangaio.rafael.assignment1;

public class OneTime extends Appointment {

	private int nDay, nMonth;	
	
	public OneTime(int nDay, int nHour, int nMonth, String Desc, Person obPerson) {
		super(nHour);
		super.setsDescription(Desc);
		super.setObPerson(obPerson);
		
		this.nDay = nDay;
		this.nMonth = nMonth;		
		
	}


	@Override
	public boolean occursOn(int nDay, int nMonth) {
		
		return (this.nDay == nDay && this.nMonth == nMonth);
		
	}
	
	

}
