package ru.netology.domain;

public class Post {
    private int id;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replayOwnerID;
    private int replayPostID;
    private int friendsOnly;
    private String postType;
    private int signerID;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedID;

    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Donut donut;
    private LikesInfo likesInfo;
    private Location location;
    private Place place;
    private Placeholder placeholder;
    private PostSource postSource;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

}
