public interface Service {
    void addUser();

    void getUser(int UserId);

    void updateUser();
}


class ServiceImpl implements Service {
    Repository repository;

    ServiceImpl(Repository repository) {
        this.repository = repository;
    }

    public void addUser() {

    }

    public void getUser(int UserId) {
        repository.getUser(UserId);
    }

    public void updateUser() {

    }


}
