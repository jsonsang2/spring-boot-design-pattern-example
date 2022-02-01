package com.example.springbootdesignpatternexample.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jsonsang2");
        repository.setName("template-project");

        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype은 언제사용되나");
        githubIssue.setGithubRepository(repository);

        String url = githubIssue.getUrl();
        System.out.println(url);

        /**
         * 위에서 만들었던 내용에서 Github Issue를 복사(clone)해서 일부만 변경 사용하고 싶은 경우
         * 복제해서 사용함으로써 GithubRepository를 만들고, Set해주는 동일한 작업을 해주지 않아도 된다.
         */

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());

        // 기본적으로 자바에서 제공하는 clone은 얕은복사를 사용하고 있기 때문에 clone과 사용하고 있는 GithubRepository 인스턴스가 같다.
        // Deep Copy를 하려면 clone을 재정의해줘야한다.
        System.out.println(clone.getGithubRepository() == githubIssue.getGithubRepository());

    }
}
