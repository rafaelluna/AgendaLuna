package luna.pangaio.rafael.assignment1;

public class Daily extends Appointment {

	public Daily(int nHour, String Desc, Person obPerson) {
		super(nHour);
		super.setsDescription(Desc);
		super.setObPerson(obPerson);
		
	}

	@Override
	public boolean occursOn(int nDay, int nMonth) {
		return true;
	}

}
