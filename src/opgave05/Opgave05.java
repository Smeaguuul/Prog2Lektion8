package opgave05;

import opgave05.models.Absence;

public class Opgave05 {
    public static void main(String[] args) {
        int[][] a = {
                {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
                {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
                {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
        };
        Absence absence = new Absence(a);

        //absence.print();
        /*
        System.out.println(absence.totalAbsence(0));
        System.out.println(absence.StudentsWithoutAbsence());
        System.out.println(absence.mostAbsence());
         */
        absence.print();
        absence.reset(4);
        absence.print();
    }

}
