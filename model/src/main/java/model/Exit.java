package model;

/**
 * Created by mathi on 21/06/2017.
 */
public class Exit extends Tile {
    
    /**
     * Tile number
     */
    public static final int TILE_NUMBER = 6;

    /**
     * @return int
     * returns the object's tile id
     */
    @Override
    public int getNumber() {
        return TILE_NUMBER;
    }

    @Override
    public boolean isFallable() {
        return false;
    }
}
