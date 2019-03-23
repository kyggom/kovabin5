package okjsp;

public class Salary {

    private String Year;
    private String Month;

    private String Name;
    private String Socinum;
    private String Gnum;
    private String posi;
    private String payments;
    private Integer Amount;
    
    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        this.Month = month;
    }

    public String getGnum() {
        return Gnum;
    }
    
    public void setGnum(String gnum) {
        Gnum = gnum;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSocinum() {
        return Socinum;
    }

    public void setSocinum(String socinum) {
        Socinum = socinum;
    }


    public String getPosi() {
        return posi;
    }

    public void setPosi(String posi) {
        this.posi = posi;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        Amount = amount;
    }

    public boolean isOK() {
        boolean isOK = (Gnum != null) && Gnum.equals("0600001");
        return isOK;
    }
}
