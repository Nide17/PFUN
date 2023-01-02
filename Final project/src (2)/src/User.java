
public class User {
    private String first_name;
    private String last_name;
    private String address;
    private String phone_number;


    public User(String first_name, String last_name, String address, String phone_number){
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.phone_number = phone_number;
    }


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

    public String toString(){
        return "User created with name " + first_name;
    }
}



