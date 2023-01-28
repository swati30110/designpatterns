package behavioural.iterator;

public class Facebook implements SocialNetwork{

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return null ;
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return null;
    }

}
