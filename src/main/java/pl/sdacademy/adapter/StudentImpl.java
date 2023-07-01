package pl.sdacademy.adapter;

import lombok.Builder;

import java.util.Collection;

@Builder
public class StudentImpl implements Student {
    private String fullName;
    private String contactDetails;
    private boolean adult;
    private Collection<Integer> results;

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getContactDetails() {
        return contactDetails;
    }

    @Override
    public boolean isAdult() {
        return adult;
    }

    @Override
    public Collection<Integer> getResults() {
        return results;
    }
}
