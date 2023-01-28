package behavioural.iterator;


public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String profileId, type;
    // An iterator object traverses the collection independently
    // from other iterators. Therefore it has to store the
    // iteration state.
    private int  currentPosition;
    private Profile[] cache;

    FacebookIterator(Facebook facebook, String profileId, String type){
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }
    private void lazyInit(){
        if(cache == null){

        }
    }
    @Override
    public Profile getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
