public class javaPractice4 {

    public static void main(String args[]) {
        System.out.println(new Student("Adiya", 20, 67)
                 .equals(new Student("Adiya", 20, 67)));
        
        System.out.println(new Student("Ranvijay", 10, 120)
                 .equals(new Student("Ranvijay Kumar", 19, 45)));
        
        System.out.println(new Student("Shubham", 54, 60)
                 .equals(new Object()));
    }
	
    static class Student {

        private String name;
        private int age;
        private int weight;

        public Student(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student s1 = (Student) o;
            return age == s1.age &&
                    weight == s1.weight &&
                    name.equals(s1.name);
        }
    }

}