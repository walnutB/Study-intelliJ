package test.db;

public interface Member {
     void conn();
     void insert( String mem );
     void select( String mem );
     void update( String mem );
     void delete( String mem );
     void disconn();
}
