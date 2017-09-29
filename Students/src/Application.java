public class Application {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        int[] results = new int[5];
        for (int i=0; i<5; i++) {
            Student st = new Student();
            st.name = "name" + i;
            st.lastName = "lastName" + i;
            students[i] = st;
            results[i] = (int)(Math.random() * 5) + 1; //потому что без + 1 какие-то двоечники получаются =(
        }

        int sum=0;
        for(int i=0; i<results.length; i++) {
            sum=sum+results[i];
        }
        float average = sum/results.length;
        System.out.println("Средний балл по группе = " + average);
    }
}
