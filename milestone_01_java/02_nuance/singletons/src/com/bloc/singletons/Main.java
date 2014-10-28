package com.bloc.singletons;

import com.bloc.singletons.listeners.*;
import com.bloc.singletons.talkers.*;

    public class Main extends Object {

        public static void main(String [] args) {
            // Instantiate some talkers and some listeners
            //Talkers: Parent, PetOwner, Singer
            //Listeners: AudienceMmber, Child, Pet

            Talker parent = new Parent();
            Talker singer = new Singer();
            Listener audienceMember = new AudienceMember();
            Listener child = new Child();

            Speakerphone speakerphone = Speakerphone.get();

            // Register listeners
            speakerphone.addListener(audienceMember);
            speakerphone.addListener(child);

            // Send messages!
            //shoutMessage(Talker talker,Class<?> cls)
            speakerphone.shoutMessage(singer, AudienceMember.class);//pass talker, pass an listener obj class
            speakerphone.shoutMessage(parent, Child.class);//pass talker, pass an listener obj class
        }
    }