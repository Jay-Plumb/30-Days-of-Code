class Student extends Person{
    private int[] testScores;
   
    // Student Constructor
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
        
    }
    
    private int calculateAverage(int[] testScores) {
        int average = 0;
        for (int i : testScores) {
            average += i;
        }
        return (average/testScores.length);
    }
    public char calculate() {
        // average the scores in testScores
        int avg = calculateAverage(testScores);
        if (avg >= 90 && avg <= 100) {
            return 'O';
        } else if (avg >= 80 && avg < 90) {
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        }else if (avg >= 55 && avg < 70) {
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
