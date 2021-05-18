package J_Patterns.Builder;

public class Builder {

    private final String userId;
    private final String token;

    public Builder(String token, String userId) {
        this.token = token;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public String getUserId() {
        return userId;
    }

    public static class Inner{

        private String userId;
        private String token;

        private Inner() {
        }

        public Inner setUserId(String userId) {
            Inner.this.userId = userId;
            return this;
        }

        public Inner setToken(String token) {
            Inner.this.token = token;
            return this;
        }
    }
}