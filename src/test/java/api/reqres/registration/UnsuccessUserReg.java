package api.reqres.registration;

public class UnsuccessUserReg {
    private String error;

    public UnsuccessUserReg() {
    }

    public UnsuccessUserReg(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
