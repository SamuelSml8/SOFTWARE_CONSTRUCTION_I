package Models;

public class Response<A, S> {
    private Boolean ok;
    private A message;
    private S data;

    public Response() {
    }

    public Response(Boolean ok, A message, S data) {
        this.ok = ok;
        this.message = message;
        this.data = data;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public A getMessage() {
        return message;
    }

    public void setMessage(A message) {
        this.message = message;
    }

    public S getData() {
        return data;
    }

    public void setData(S data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "ok=" + ok +
                ", message=" + message +
                ", data=" + data +
                '}';
    }


}