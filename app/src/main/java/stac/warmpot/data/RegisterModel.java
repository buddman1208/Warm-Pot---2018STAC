package stac.warmpot.data;

public class RegisterModel {
     private int status;
     private TokenData data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public TokenData getData() {
        return data;
    }

    public void setData(TokenData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public RegisterModel(int statis, TokenData data,String message) {
        this.message = message;
        this.status = statis;
        this.data = data;
    }
}
