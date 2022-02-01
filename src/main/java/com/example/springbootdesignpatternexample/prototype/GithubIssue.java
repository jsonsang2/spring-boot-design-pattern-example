package com.example.springbootdesignpatternexample.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubIssue implements Cloneable {

    private int id;

    private String title;

    private GithubRepository githubRepository;

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                githubRepository.getUser(),
                githubRepository.getName(),
                this.id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
