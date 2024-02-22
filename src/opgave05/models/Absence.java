package opgave05.models;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        //Printer månederne
        String[] måneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "Septemper", "Oktober", "November", "December"};
        System.out.printf("%14s", "Elev / Måned: ");
        for (int i = 0; i < absenceSchema[1].length; i++) {
            System.out.printf("%10s", måneder[i]);
        }

        //Printer sperator linje
        System.out.println();
        System.out.printf("%14s", " ");
        for (int i = 0; i < absenceSchema[1].length; i++) {
            System.out.printf("%10s", "__________");
        }
        System.out.println();

        //Printe rækkerne under
        for (int i = 0; i < absenceSchema.length; i++) {
            System.out.printf("%14s", (i + 1) + " :");
            for (int j = 0; j < absenceSchema[i].length; j++) {

                System.out.printf("%10s", absenceSchema[i][j]);
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber) {
        int sum = 0;
        for (int i = 0; i < absenceSchema[studentNumber].length; i++) {
            sum += absenceSchema[studentNumber][i];
        }
        return sum;
    }

    public double average(int studentNumber) {
        int sum = 0;
        for (int i = 0; i < absenceSchema[studentNumber].length; i++) {
            sum += absenceSchema[studentNumber][i];
        }
        return sum / absenceSchema[studentNumber].length;
    }

    public int StudentsWithoutAbsence() {
        int perfectStudents = absenceSchema.length;

        for (int elev = 0; elev < absenceSchema.length; elev++) {
            int måned = 0;
            boolean found = false;
            while (found == false && måned < absenceSchema[elev].length) {
                if (absenceSchema[elev][måned] > 0) {
                    perfectStudents--;
                    found = true;
                } else {
                    måned++;
                }
            }
            found = false;
        }
        return perfectStudents;
    }

    public int mostAbsence() {
        int worstStudent = 0;
        int MostAbsence = 0;
        for (int i = 0; i < absenceSchema.length; i++) {
            if (totalAbsence(i) > MostAbsence){
                MostAbsence = totalAbsence(i);
                worstStudent = i;
            }
        }
        return worstStudent + 1;
    }

    public void reset(int studentNumber) {
        for (int i = 0; i < absenceSchema[studentNumber].length; i++) {
            absenceSchema[studentNumber][i] = 0;
        }
    }
}
