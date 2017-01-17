package luna.pangaio.rafael.assignment1;

public class Monthly extends Appointment {

	public int nDay;
	
	public Monthly(int nHour, int nDay, String Desc, Person obPerson) {
		super(nHour);
		super.setsDescription(Desc);
		super.setObPerson(obPerson);
		
		this.nDay = nDay;
	}

	@Override
	public boolean occursOn(int nDay, int nMonth) {
		// TODO Auto-generated method stub
		return (this.nDay == nDay);
	}

}
