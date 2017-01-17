package luna.pangaio.rafael.assignment1;

public abstract class Appointment {

	private int nHour;
	private String sDescription;
	private Person obPerson;
	
	public Appointment(int nHour) {
		this.nHour = nHour;
	}
	
	/*
     * Method that overrides default equals behavior We define equality to be
     * that both Hour and obPerson are equal.
     */
    public boolean equals( Object obj )
    {

        boolean bResult = super.equals(obj);

        
            if ( bResult && obj instanceof Appointment )
            {

            	Appointment objTemp = (Appointment) obj;

                // we have the correct type of object to deal with
                bResult = (this.nHour == objTemp.nHour && this.getObPerson().equals(objTemp.getObPerson()));

            }

        return bResult;

    }
	
	public abstract boolean occursOn(int nDay, int nMonth);
	
	public boolean forPerson(Person p){
		
		return this.getObPerson().equals(p);
		
	}

	public String getsDescription() {
		return sDescription;
	}

	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}

	public Person getObPerson() {
		return obPerson;
	}

	public void setObPerson(Person obPerson) {
		this.obPerson = obPerson;
	}

}
