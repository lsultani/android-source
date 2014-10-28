package com.bloc.singletons;

import java.util.HashSet;
import java.util.Iterator;

/*
 * This is a singleton class which maintains communication
 * between classes and Listeners
 */
public class Speakerphone extends Object {
    //static instance
    private static Speakerphone speakerphone;


    /*
     * get
     * @return the singleton instance of Speakerphone
     */
    //public getter
    public static Speakerphone get() {
        if (speakerphone == null) {
            speakerphone = new Speakerphone();
        }
        return speakerphone;
    }

    //set of listeners
    private HashSet<Listener> listenersSet;

    private Speakerphone() {
        listenersSet = new HashSet<Listener>();
    }

    /*
     * addListener
     * Add a listener to Speakerphone's list
     * @param listener an instance of the Listener interface
     */
    public void addListener(Listener listener) {
        listenersSet.add(listener);
    }


    /*
     * removeListener
     * Remove a Listener from the Speakerphone's list
     * @param listener the Listener to remove
     */
    public void removeListener(Listener listener) {
        listenersSet.remove(listener);
    }

    /*
     * shoutMessage
     * Sends the message to all of the Listeners tracked by Speakerphone
     * @param talker a Talker whose message will be sent
     */
    public void shoutMessage(Talker talker) {
        Iterator<Listener> listenIterator = listenersSet.iterator();
        //better to use iterato, if removing items
        while (listenIterator.hasNext()) {
            listenIterator.next().onMessageReceived(talker.getMessage());
            //pass talker message
        }

    }

    /*
     * shoutMessage
     * Sends the message to all of the Listeners which are instances of
     * the class parameter
     * @param talker a Talker whose message will be sent
     * @param cls a Class object representing the type which the Listener
     *			  should extend from in order to receive the message
     *
     * HINT: see Class.isAssignableFrom()
     *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
     */
    public void shoutMessage(Talker talker, Class<?> cls) {
        Iterator<Listener> listenIterator = listenersSet.iterator();
        while (listenIterator.hasNext()) {
            Listener listen = listenIterator.next();
            if (cls.isAssignableFrom(listen.getClass())) {
                listen.onMessageReceived(talker.getMessage());
                //pass talker message
            }
        }
    }

    /*
     * removeAll
     * Removes all Listeners from Speakerphone
     */
    public void removeAll() {
        listenersSet.clear();
    }

}