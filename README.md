# MinneapolisBoulderingProjectOccupancyCounter
A very simple Android app for viewing the current occupancy of Minneapolis Bouldering Project: https://minneapolisboulderingproject.com/

The app is powered by an HTML widget from https://minneapolisboulderingproject.com/occupancy which is located at: https://portal.rockgympro.com/portal/public/18a5ea0176c6494befd44f163f15750c/occupancy

Ex: ![Screenshot](mbp_count_screenshot.png?raw=true "Screenshot"){:height="5%" width="5%"}

The widget is animated and indicates the datetime the data was last updated. According to the source code of the website, the capacity is +400, but about 200 and the place is going to be real crowded.

Some features that would be cool but are on my back burner at the moment are:

- Add an image to the background of the app

- Log occupancy data and have the ability to see a graph of occupancy over time

- Color coding based on current occupancy

- Add bug reporting or feature requesting through a settings menu

- Add the option to scrape just the number from the gauge and toss the rest of it

- Add some failsafes incase the widget URL changes

### Building

To build the app:

1. Clone the repository to your personal machine

2. Import the project with android studio

3. Ensure SDK 30.0.3 is installed with SDK Manager in the Tools tab in the upper left

4. Build to an apk via *Build* > *Build Bundle(s) / APK(s)* > *Build APK(s)

5. Open the directory the apk was built to, for me it was `app/build/outputs/apk/debug/`

6. Transfer the file to your Android device

7. Install the apk using your Android file manager of choice. Tutorial if you get stuck: https://www.lifewire.com/install-apk-on-android-4177185
