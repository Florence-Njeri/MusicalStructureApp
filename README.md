<h1>Musical Structure App</h1>
<p>he goal is to design and layout the flow for the structure of a Music Player app. Note that for this project, the app does not actually need to play music.</p>
<h3>Description</h3>
<p>design and layout a music playing app that displays the list of available songs in a 
ListView or a GridView, navigates to a details screen of the currentlyplaying song, and 
uses explicit intents to navigate around the app.</p>
<h4>Requirements</h4>
<ul>
  <li>Designing an app experience to achieve a certain goal</li>
  <li>Creating new activities</li>
  <li>Using explicit Intents to link between activities in your app</li>
  <li.Using OnClickListeners to add behavior to buttons using Java code.</li>
  <li>Creating your own Custom Class</li>
<li>Looping through an ArrayList</li.
<li>Populating a ListView or GridView with an ArrayAdapter</li>
</ul>
<h5>Challenge Encountered</h5>
<p>Getting the Musicians name and also the song title from the list View and displaying it in the 
NowPLaying Activity</p>
'''
//Create an AfroPop object from which to get the Music title and musicians name

                AfroPop pop = afroPopArrayList.get(position);
                Intent intent = new Intent(AfroPopActivity.this, SongPlayingActivity.class);
                intent.putExtra("musicTitle", pop.getMusician());
                intent.putExtra("musician", pop.getMusicTitle());

                startActivity(intent);
                '''
<p> You create an object of the class in which the musician and music title is defined.Then get the position of the
clicked view from the arrayList and pass it to the putExras in the intent</p>
<a href="https://imgflip.com/gif/2hgjgt"><img src="https://i.imgflip.com/2hgjgt.gif" title="made at imgflip.com"/></a>

