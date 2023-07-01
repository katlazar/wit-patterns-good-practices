package pl.sdacademy.adapter;

public class PupilToStudentMapper {

    public Student map(Pupil pupil) {
        return StudentImpl.builder()
                .fullName(pupil.getLastName()+" "+pupil.getFirstName())
                .adult(pupil.getAge()>18)
                .contactDetails(pupil.getEmail())
                .results(pupil.getGrades())
                .build();
    }
}
