package com.example;

import java.util.Random;

/**
 * Created by abhi on 11/22/2016.
 */
public class Jokes {
    public static String getJoke(){
        String jokes[]={
                "Why did the physics teacher break up with the biology teacher? There was no chemistry.\n" +
                        "\n" ,
                "Why do the French like to eat snails so much?\n" +
                        "\n" +
                        "A. They can’t stand fast food.\n" ,

                "Husband: “Oh the weather is lovely today. Shall we go out for a quick jog?“\n" +
                        "\n" +
                        "Wife: Hahaha, I love the way you pronounce ‘Shall we go out and have a cake’!\n",
                "Why does it suck to be a penguin?\n" +
                        "Because even when you get angry, you still look cute.",
                "I’ve always thought my neighbors were quite nice people. But then they put a password on their Wi-Fi.\n",
                "What did the stamp say to the envelope? \n" +
                        "-\n" +
                        "You stick with me and I will take you places! \n",
                "Why is women’s soccer so rare?\n" +
                        "-\n" +
                        "It’s quite hard to find enough women willing to wear the same outfit.",
                "If I ever go missing, you should put my picture on beer rather than milk bottles. This way, my friends will find me faster.\n",
                "What do you get when you cross a bear with a skunk? \n" +
                        " \n" +
                        "Winnie the Pooh.\n",
                "What are mixed feelings?\n" +
                        "\n" +
                        "Watching your mother-in-law backing up towards the edge of a cliff in your new BMW.\n",
                "Why do people never eat clocks?\n" +
                        " \n" +
                        "Because it’s really time consuming.\n",

                "Shortest joke a software developer can tell: \n" +
                        "\n" +
                        "“I’ll be ready soon.\n",
                "What do driving and dating have in common?\n" +
                        " \n" +
                        "Both end up with you being chased by the police if you go too fast.\n" +
                        "\n",
                "What do you get if you crossbreed a cute Easter rabbit with an insect?\n" +
                        "\n" +
                        "Bugs Bunny.\n" ,
                "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n",
                "Son: \"Is this insecticide good for mosquitos?\"\n" +
                        "– \n" +
                        "Dad: \"Not at all, it kills them!\"\n",
                "Why did the dinosaur cross the road? \n" +
                        "\n" +
                        "Because the chicken hasn’t evolved yet.\n",
                "Which is the flower on face?\n" +
                        "Tu – lips!" ,
                "When I see lovers' names carved in a tree, I don't think its cute. I just think it's crazy how many people bring knives on a date." ,
                "TEACHER : Pappu, tell me frankly do you say prayers before eating ?\n" +
                        ".\n" +
                        "PAPPU : No sir, I don’t have to, my Mother is good cock." ,
                "TEACHER : Pappu, your composition on  My Dog is exactly the same as your brother’s. Did you copy this ?\n" +
                        "PAPPU : No, Teacher, it’s the same Dog." ,
                "Teacher: Could you please pay a little attention here?\n" +
                        "Student: yes mam, I am paying as little attention as i can. !!" ,
                "Two student were chatting:\n" +
                        "First: Do you know what is snake’s favorite subject?\n" +
                        "second:, no, you tell.\n" +
                        "first: Hisssstory!!!" ,
                "Teacher: who will tell the chemical formula of water?\n" +
                        "One student: Its h.i.j.k.l.m.n.o.\n" +
                        "Teacher: What is this?\n" +
                        "Student: Mam, yesterday you told us that it is H to O !!" ,
                "Teacher: From where to where foreigner ruled us?\n" +
                        "Student: I am not sure but I think from page 50 to 55…" ,
                "Man: How can you tell if a man is happy?\n" +
                        "Woman: Who cares?!" ,
                "If you understand English, press 1. If you do not understand English, press 2.\n" +
                        "\n" +
                        "Recording on an Australian tax help line" ,
                "I bought one of those tapes to teach you Spanish in your sleep. During the night, the tape skipped. Now I can only stutter in Spanish." ,
                "One woman raved about the rides at our water park, but she did have a valid complaint: \"The water in the wave pool tastes horrible!\" ",
                "Client to designer: It doesn’t really look purple. It looks more like a mixture of red and blue." ,
                "I used to date a hoarder, and she broke up with me. That stings extra hard—I’m like the one thing she can get rid of." ,
                "One of my friends is pregnant. And I’m really excited. Not for the baby but because she’s one of my skinniest friends." ,
                "The closest I’ve been to a diet this year is erasing food searches from my browser history." ,
                "After i-messaging back and forth with my wife, I jokingly commanded Siri to pass along this message: You need to get back to work now; you have a husband to support.\n" +
                        "\n" +
                        "Here’s what Siri sent: You need \u2028to get back to work now; you have \u2028a has-been to support." ,
                "The depressing thing about tennis is that no matter how much I play, I'll never be as good as a wall. I played a wall once. They're relentless.\"\n" +
                        "\n" +
                        "\"I like rice. Rice is great when you're hungry and you want 2,000 of something.\"" ,
                "\"My therapist says I have a preoccupation with vengeance. We'll see about that.\"\n" +
                        "\n" +
                        "\"I went to a karaoke bar last night that didn't play any Seventies music. At first I was afraid. Oh, I was petrified.\"" ,
                "\"Why can't we have racism that's ignorant but nice? You could have stereotypes that are positive about race. You could say, 'Those Chinese people, they can fly! You know about the Puerto Ricans... they're made of candy!'\"" ,
                "\"A man walks into a chemist's and says, 'Can I have a bar of soap, please?' The chemist says, 'Do you want it scented?' And the man says, 'No, I'll take it with me now.'\"" ,
                "\"Belinda Carlisle sings, 'We dream the same dream.' But I can't believe that every night Belinda Carlisle has a wet dream about Wilma Flintstone.\"" ,
                "\"A friend will help you move. A best friend will help you move a body.\"" ,
                "\"I was walking along today, and on the road I saw a small, dead baby ghost. Although thinking about it, it might have been a handkerchief.\"" ,
                "\"I supplied Filofaxes to the Mafia - yeah, I was involved in very organised crime." ,
                "\"I'm very English, really. I even ordered a book on the internet, 'How To Have Absolutely Nothing To Do With Your Neighbours'. Unfortunately, I was out when it was delivered.\"" ,
                "The pollen count, now that's a difficult job. Especially if you've got hay fever.\"" ,
                "\"I lost my job as a cricket commentator for saying, 'I don't want to bore you with the details.'\"" ,
                "\"I went to the doctor and he said, 'You've got hypochondria.' I said, 'Not that as well.'\"" ,
                "\"I've just been on a once-in-a-lifetime holiday. I'll tell you what, never again.\"" ,
                "\"What's the most evil snack imaginable for a vegetarian? Philosophically speaking, it's a Scotch egg because it's got death on the outside and potential for life within.\"" ,
                "\"There are only two conditions where you're allowed to wake up a woman on a lie-in: it's snowing or the death of a celebrity.\"" ,
                "\"A Geordie said to me, 'Are yous looking at us?' How many mistakes can you make in one sentence?\"" ,
                "\"My wife and I both made a list of five people we could sleep with. She read hers out: 'One, George Clooney; two, Brad Pitt; three, Justin Timberlake; four, Jake Gyllenhaal; five, Johnny Depp.' I thought, I've got the better deal here: 'One, your sister...'\"" ,
                "\"A Geordie said to me, 'Are yous looking at us?' How many mistakes can you make in one sentence?\"" ,
                "\"Don't Man City and Man United sound a bit like gay clubs? 'Where you off to tonight? Man City? We're off to Man United. And a bit later we're off to the MEN Arena.'\"" ,

        };
        int index=new Random().nextInt(jokes.length);
        return jokes[index];
    }
}
