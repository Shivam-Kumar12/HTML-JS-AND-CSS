class UnderAge extends Exception {
    int age;

    UnderAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UnderAge: " + age;
    }
}