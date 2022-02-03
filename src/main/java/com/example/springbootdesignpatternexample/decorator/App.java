package com.example.springbootdesignpatternexample.decorator;

public class App {

    private static boolean enableSpamFilter = true;

    private static boolean enableTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enableSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (enableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("개꿀잼...");
        client.writeComment("http://theteampearl.com");
    }
}
