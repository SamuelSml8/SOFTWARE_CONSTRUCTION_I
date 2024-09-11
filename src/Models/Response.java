package helpers;

public class Response<A, S> {
    private Boolean ok;
    private A message;
    private S data;

    // Constructor sin parámetros (NoArgsConstructor)
    public Response() {
    }

    // Constructor con todos los parámetros (AllArgsConstructor)
    public Response(Boolean ok, A message, S data) {
        this.ok = ok;
        this.message = message;
        this.data = data;
    }

    // Getters
    public Boolean getOk() {
        return ok;
    }

    // Setters
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
}