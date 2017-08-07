Aaron Hoskins
MAC Training Test 1
Aug 7, 2017

1. git push
2. res folder
3.
4.
5. match-parent = matches the size of the parent layout
   wrap-content = sized to fit within the context
6. android:onClick = "<METHODNAME>"
7. <BUTTONNAME>.setOnClickListener(new View.OnClickListener
                    @Override
                    public View onClick(View view){
                        //do something
                    }});
8.  android:textColor="<COLOR>"
9.  res/color file
10. Using onConfigurationChange.
        onConfigurationChange.orination(<ORINTATION>){
            <LAYOUT>.changeLayout(<NEWLAYOUT>)
        }
11.
12. Views are single items within the activity(buttons,text,ect)  A view group is a grouping
    of such items for a common purpose.
13. orentation
14. Linear if you want items to display vertically or horizontally to each other only.
    Relative will positions items to the next position that has enough room to display the item.
15. <IMAGEVIEW>.setImage(<IMAGELOCATION>);
16. onCreate(),onStart(),onResume(),onPause(),onRestart(),onStop(),onDestroy()
17. Activity1.onResume(),Activity2.onCreate(),Activity2.onStart(),Activity1.onPause(),
        Activity2.onStop(),Activity2.onResume()
18. Restrict the orientation of the activity within the manafest
19. putString
20. String id, String Data
21. commit()
22. getSharedPreferences
23. A wrapper that contains information so that it can be passed
24. onPause the activity is still in the background running, whereas onStop the program is not
      active.
25.  onActivityResult
26.
27.  Implicit (we do not define what is being sent within the call)
     Explicit (we define what is being sent with the call)
28.  Shared Pref, File, SQL, passed
29.  <INTENT>.putExtra(<DATA>)
30.  Basic, serializable, parcelable
31.  <OBJECT> <OBNAME> = <INTENT>.getExtra(<DATA>)
32.  Context is the bounds of which an item can be referenced
33.  Linear, Relative, drawer, grid
34.  Cast the object into either a Serializable or parcelable object.
35.  JAVA based way to turn an object into something that can be sent as a key -> bitCode item.
36.  Android based way to turn an object into something that can be sent by defining what the
      object is and how to handle it in code.
37.  Parcelable, usually smaller in size and less chance of runtime errors due to inproper
      object translation.
38.
39.
40. How multiple activities are handled:
        standard:        creates a new activity everytime one is called
        single top:      creates a new activity when called unless the last called activty is
                         the same. Then it will save data, create new activity, and destroy
                         the old one.
        single instance: only one instance of the activity is allow per task.
        single task:     only one instance of the activity is allowed.

41. The backstack is the stack of activitys active for a task.
42. In Android Studio  ==  Build->BuildAPK
43. In Android Studio  ==  Build->BuildAPK and enter key
