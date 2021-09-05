public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String access="";
        for (int r: rights){
            if (r>=minPermission) {
                access+="A";

            }
            else {
                access+="D";

            }

        }
        return access;
    }
}
