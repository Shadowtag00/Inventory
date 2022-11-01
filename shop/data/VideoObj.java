package shop.data;

/**
 * Implementation of Video interface.
 * @see Data
 */
final class VideoObj implements Video {
  private final String _title;
  private final int    _year;
  private final String _director;

  /**
   * Initialize all object attributes.
   * Title and director are "trimmed" to remove leading and final space.
   * @throws IllegalArgumentException if object invariant violated.
   */
  VideoObj(String title, int year, String director) {
    _title = title;
    _director = director;
    _year = year;
  }

  public String director() {
    // TODO
    return _director;
  }

  public String title() {
    // TODO
    return _title;
  }

  public int year() {
    // TODO
    return _year;
  }

  public boolean equals(VideoObj thatObject) {
    // TODO
	  if(_director.hashCode()!=thatObject.director().hashCode()) {
	    	return false;
	    }else if(_title.hashCode()!=thatObject.title().hashCode()) {
	    	return false;
	    }else if(_year!=thatObject.year()) {
	    	return false;
	    }else {
	    	return true;
	    }
  }

  public int hashCode() {
    // TODO
	  int hash = 17;
	    hash=+(37*hash+this._title.hashCode());
	    hash=+(37*hash+(int)this._year);
	    hash=+(37*hash+this._director.hashCode());
	    
	    return hash;
  }

  public int compareTo(Video that) {
    // TODO
    return -1;
  }

  public String toString() {
    // TODO
	  return(_title+" ("+_year+") : "+_director);
  }
}
