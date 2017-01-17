package luna.pangaio.rafael.assignment1;

public class Person {

	private String sFirst;
	private String sLast;
	
	public Person(String sFirst, String sLast) {
		this.sFirst = sFirst;
		this.sLast = sLast;
	}
	
	/*
     * Method that overrides default equals behaviour We define equality to be
     * that both names are equal
     */
    public boolean equals( Object obj )
    {
            if (obj instanceof Person )
            {

                Person objTemp = (Person) obj;

                return (this.sFirst.equals(objTemp.sFirst) && this.sLast.equals(objTemp.sLast));

            }

            return false;

    }
    
    public String toString(){
    	return this.sFirst + " " + this.sLast;
    }

}
