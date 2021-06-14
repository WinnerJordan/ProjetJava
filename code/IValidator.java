public interface IValidator <T> {
    public boolean validationNci(int nci);
    public boolean validationTel(String tel);
    public boolean validateEmailAddress(String email);

}