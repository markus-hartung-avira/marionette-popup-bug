# marionette-popup-bug

The test does the following:
1. Start a firefox session with an extension installed
2. Click the extension icon which opens the popup
3. Check if an element is displayed in the popup
4. Close the popup
5. Check if the extension icon is displayed

The test will fail in step 5, my guess is due to an error thrown after step 4

### Stack trace

```
"C:\Program Files\Java\jdk1.8.0_101\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.1.3\lib\idea_rt.jar=55208:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_101\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_101\jre\lib\rt.jar;C:\Users\markus.hartung\projects\popuptest\target\classes;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-java\3.4.0\selenium-java-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-api\3.4.0\selenium-api-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver\3.4.0\selenium-chrome-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-edge-driver\3.4.0\selenium-edge-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-firefox-driver\3.4.0\selenium-firefox-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-ie-driver\3.4.0\selenium-ie-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-opera-driver\3.4.0\selenium-opera-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-remote-driver\3.4.0\selenium-remote-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-safari-driver\3.4.0\selenium-safari-driver-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\selenium-support\3.4.0\selenium-support-3.4.0.jar;C:\Users\markus.hartung\.m2\repository\cglib\cglib-nodep\3.2.4\cglib-nodep-3.2.4.jar;C:\Users\markus.hartung\.m2\repository\org\apache\commons\commons-exec\1.3\commons-exec-1.3.jar;C:\Users\markus.hartung\.m2\repository\org\apache\commons\commons-lang3\3.5\commons-lang3-3.5.jar;C:\Users\markus.hartung\.m2\repository\commons-codec\commons-codec\1.10\commons-codec-1.10.jar;C:\Users\markus.hartung\.m2\repository\commons-io\commons-io\2.5\commons-io-2.5.jar;C:\Users\markus.hartung\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\markus.hartung\.m2\repository\org\w3c\css\sac\1.3\sac-1.3.jar;C:\Users\markus.hartung\.m2\repository\net\sourceforge\cssparser\cssparser\0.9.22\cssparser-0.9.22.jar;C:\Users\markus.hartung\.m2\repository\com\google\code\gson\gson\2.8.0\gson-2.8.0.jar;C:\Users\markus.hartung\.m2\repository\com\google\guava\guava\21.0\guava-21.0.jar;C:\Users\markus.hartung\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\markus.hartung\.m2\repository\net\sourceforge\htmlunit\htmlunit\2.26\htmlunit-2.26.jar;C:\Users\markus.hartung\.m2\repository\net\sourceforge\htmlunit\htmlunit-core-js\2.26\htmlunit-core-js-2.26.jar;C:\Users\markus.hartung\.m2\repository\net\sourceforge\htmlunit\neko-htmlunit\2.25\neko-htmlunit-2.25.jar;C:\Users\markus.hartung\.m2\repository\org\apache\httpcomponents\httpclient\4.5.3\httpclient-4.5.3.jar;C:\Users\markus.hartung\.m2\repository\org\apache\httpcomponents\httpcore\4.4.6\httpcore-4.4.6.jar;C:\Users\markus.hartung\.m2\repository\org\apache\httpcomponents\httpmime\4.5.3\httpmime-4.5.3.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\jetty-io\9.4.1.v20170120\jetty-io-9.4.1.v20170120.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\jetty-util\9.4.1.v20170120\jetty-util-9.4.1.v20170120.jar;C:\Users\markus.hartung\.m2\repository\net\java\dev\jna\jna\4.1.0\jna-4.1.0.jar;C:\Users\markus.hartung\.m2\repository\net\java\dev\jna\jna-platform\4.1.0\jna-platform-4.1.0.jar;C:\Users\markus.hartung\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\markus.hartung\.m2\repository\com\codeborne\phantomjsdriver\1.4.0\phantomjsdriver-1.4.0.jar;C:\Users\markus.hartung\.m2\repository\org\seleniumhq\selenium\htmlunit-driver\2.26\htmlunit-driver-2.26.jar;C:\Users\markus.hartung\.m2\repository\javax\servlet\javax.servlet-api\3.1.0\javax.servlet-api-3.1.0.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\websocket\websocket-api\9.4.3.v20170317\websocket-api-9.4.3.v20170317.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\websocket\websocket-client\9.4.3.v20170317\websocket-client-9.4.3.v20170317.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\jetty-client\9.4.3.v20170317\jetty-client-9.4.3.v20170317.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\jetty-http\9.4.3.v20170317\jetty-http-9.4.3.v20170317.jar;C:\Users\markus.hartung\.m2\repository\org\eclipse\jetty\websocket\websocket-common\9.4.3.v20170317\websocket-common-9.4.3.v20170317.jar;C:\Users\markus.hartung\.m2\repository\xalan\serializer\2.7.2\serializer-2.7.2.jar;C:\Users\markus.hartung\.m2\repository\xalan\xalan\2.7.2\xalan-2.7.2.jar;C:\Users\markus.hartung\.m2\repository\xerces\xercesImpl\2.11.0\xercesImpl-2.11.0.jar;C:\Users\markus.hartung\.m2\repository\xml-apis\xml-apis\1.4.01\xml-apis-1.4.01.jar" PopupTest
### execute: newSession
{desiredCapabilities=Capabilities [{moz:firefoxOptions={binary=Optional.empty, args=[], legacy=false, logLevel=null, prefs={}, profile=org.openqa.selenium.firefox.FirefoxProfile@c81cdd1}, firefox_profile=org.openqa.selenium.firefox.FirefoxProfile@c81cdd1}]}
1495525029029	geckodriver	INFO	Listening on 127.0.0.1:37147
1495525029752	geckodriver::marionette	INFO	Starting browser \\?\C:\Program Files\Mozilla Firefox\firefox.exe with args ["-marionette"]
start: "C:\\Program Files\\Mozilla Firefox\\firefox.exe" "-marionette" "-profile" "C:\\Users\\MARKUS~1.HAR\\AppData\\Local\\Temp\\rust_mozprofile.QqOyGuchKcnG"
1495525029995	addons.manager	DEBUG	Application has been upgraded
1495525029999	addons.manager	DEBUG	Loaded provider scope for resource://gre/modules/addons/XPIProvider.jsm: ["XPIProvider"]
1495525030001	addons.manager	DEBUG	Loaded provider scope for resource://gre/modules/LightweightThemeManager.jsm: ["LightweightThemeManager"]
1495525030004	addons.manager	DEBUG	Loaded provider scope for resource://gre/modules/addons/GMPProvider.jsm
1495525030006	addons.manager	DEBUG	Loaded provider scope for resource://gre/modules/addons/PluginProvider.jsm
1495525030006	addons.manager	DEBUG	Starting provider: XPIProvider
1495525030007	addons.xpi	DEBUG	startup
1495525030007	addons.xpi	INFO	Mapping marionette-popup-bug@avira.com to C:\Users\MARKUS~1.HAR\AppData\Local\Temp\rust_mozprofile.QqOyGuchKcnG\extensions\marionette-popup-bug@avira.com
1495525030008	addons.xpi	INFO	Removing all system add-on upgrades.
1495525030008	addons.xpi	INFO	SystemAddonInstallLocation directory is missing
1495525030009	addons.xpi	INFO	Mapping aushelper@mozilla.org to C:\Program Files\Mozilla Firefox\browser\features\aushelper@mozilla.org.xpi
1495525030009	addons.xpi	INFO	Mapping e10srollout@mozilla.org to C:\Program Files\Mozilla Firefox\browser\features\e10srollout@mozilla.org.xpi
1495525030009	addons.xpi	INFO	Mapping firefox@getpocket.com to C:\Program Files\Mozilla Firefox\browser\features\firefox@getpocket.com.xpi
1495525030009	addons.xpi	INFO	Mapping webcompat@mozilla.org to C:\Program Files\Mozilla Firefox\browser\features\webcompat@mozilla.org.xpi
1495525030010	addons.xpi	INFO	Mapping {972ce4c6-7e08-4474-a285-3208198ce6fd} to C:\Program Files\Mozilla Firefox\browser\extensions\{972ce4c6-7e08-4474-a285-3208198ce6fd}.xpi
1495525030011	addons.xpi	DEBUG	checkForChanges
1495525030011	addons.xpi	INFO	SystemAddonInstallLocation directory is missing
1495525030011	addons.xpi	DEBUG	Loaded add-on state from prefs: {}
1495525030012	addons.xpi	DEBUG	New add-on marionette-popup-bug@avira.com in app-profile
1495525030012	addons.xpi	DEBUG	getModTime: Recursive scan of marionette-popup-bug@avira.com
1495525030013	addons.xpi	DEBUG	New add-on aushelper@mozilla.org in app-system-defaults
1495525030014	addons.xpi	DEBUG	getModTime: Recursive scan of aushelper@mozilla.org
1495525030014	addons.xpi	DEBUG	New add-on e10srollout@mozilla.org in app-system-defaults
1495525030015	addons.xpi	DEBUG	getModTime: Recursive scan of e10srollout@mozilla.org
1495525030015	addons.xpi	DEBUG	New add-on firefox@getpocket.com in app-system-defaults
1495525030015	addons.xpi	DEBUG	getModTime: Recursive scan of firefox@getpocket.com
1495525030016	addons.xpi	DEBUG	New add-on webcompat@mozilla.org in app-system-defaults
1495525030016	addons.xpi	DEBUG	getModTime: Recursive scan of webcompat@mozilla.org
1495525030016	addons.xpi	DEBUG	New add-on {972ce4c6-7e08-4474-a285-3208198ce6fd} in app-global
1495525030016	addons.xpi	DEBUG	getModTime: Recursive scan of {972ce4c6-7e08-4474-a285-3208198ce6fd}
1495525030017	addons.xpi	DEBUG	getInstallState changed: true, state: {"app-profile":{"marionette-popup-bug@avira.com":{"d":"C:\\Users\\MARKUS~1.HAR\\AppData\\Local\\Temp\\rust_mozprofile.QqOyGuchKcnG\\extensions\\marionette-popup-bug@avira.com","st":1495525029737,"mt":1495525029737}},"app-system-defaults":{"aushelper@mozilla.org":{"d":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\aushelper@mozilla.org.xpi","st":1493925665000},"e10srollout@mozilla.org":{"d":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\e10srollout@mozilla.org.xpi","st":1493925665000},"firefox@getpocket.com":{"d":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\firefox@getpocket.com.xpi","st":1493925665000},"webcompat@mozilla.org":{"d":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\webcompat@mozilla.org.xpi","st":1493925665000}},"app-global":{"{972ce4c6-7e08-4474-a285-3208198ce6fd}":{"d":"C:\\Program Files\\Mozilla Firefox\\browser\\extensions\\{972ce4c6-7e08-4474-a285-3208198ce6fd}.xpi","st":1493925665000}}}
1495525030024	addons.xpi-utils	DEBUG	Opening XPI database C:\Users\MARKUS~1.HAR\AppData\Local\Temp\rust_mozprofile.QqOyGuchKcnG\extensions.json
1495525030025	addons.xpi-utils	DEBUG	New add-on marionette-popup-bug@avira.com installed in app-profile
*** Blocklist::_loadBlocklistFromFile: blocklist is disabled
1495525030217	DeferredSave.extensions.json	DEBUG	Save changes
1495525030217	addons.xpi-utils	DEBUG	New add-on aushelper@mozilla.org installed in app-system-defaults
1495525030221	DeferredSave.extensions.json	DEBUG	Starting timer
1495525030222	DeferredSave.extensions.json	DEBUG	Save changes
1495525030222	addons.xpi-utils	DEBUG	New add-on e10srollout@mozilla.org installed in app-system-defaults
1495525030225	DeferredSave.extensions.json	DEBUG	Save changes
1495525030226	addons.xpi-utils	DEBUG	New add-on firefox@getpocket.com installed in app-system-defaults
1495525030232	DeferredSave.extensions.json	DEBUG	Save changes
1495525030232	addons.xpi-utils	DEBUG	New add-on webcompat@mozilla.org installed in app-system-defaults
1495525030236	DeferredSave.extensions.json	DEBUG	Save changes
1495525030236	addons.xpi-utils	DEBUG	New add-on {972ce4c6-7e08-4474-a285-3208198ce6fd} installed in app-global
1495525030240	DeferredSave.extensions.json	DEBUG	Save changes
1495525030240	addons.manager	DEBUG	Registering startup change 'installed' for marionette-popup-bug@avira.com
1495525030240	addons.manager	DEBUG	Registering startup change 'installed' for marionette-popup-bug@avira.com
1495525030248	addons.xpi	DEBUG	Loading bootstrap scope from C:\Users\MARKUS~1.HAR\AppData\Local\Temp\rust_mozprofile.QqOyGuchKcnG\extensions\marionette-popup-bug@avira.com
1495525030250	addons.xpi	DEBUG	Calling bootstrap method install on marionette-popup-bug@avira.com version 1.0.0
1495525030251	addons.xpi-utils	DEBUG	Make addon app-profile:marionette-popup-bug@avira.com visible
1495525030254	addons.xpi	DEBUG	Add-on marionette-popup-bug@avira.com blocks e10s rollout.
1495525030254	DeferredSave.extensions.json	DEBUG	Save changes
1495525030254	addons.manager	DEBUG	Registering startup change 'installed' for aushelper@mozilla.org
1495525030255	addons.xpi	DEBUG	Loading bootstrap scope from C:\Program Files\Mozilla Firefox\browser\features\aushelper@mozilla.org.xpi
1495525030258	addons.xpi	DEBUG	Calling bootstrap method install on aushelper@mozilla.org version 2.0
1495525030258	addons.xpi-utils	DEBUG	Make addon app-system-defaults:aushelper@mozilla.org visible
1495525030258	addons.xpi	DEBUG	Add-on marionette-popup-bug@avira.com blocks e10s rollout.
1495525030258	DeferredSave.extensions.json	DEBUG	Save changes
1495525030258	addons.manager	DEBUG	Registering startup change 'installed' for e10srollout@mozilla.org
1495525030259	addons.xpi	DEBUG	Loading bootstrap scope from C:\Program Files\Mozilla Firefox\browser\features\e10srollout@mozilla.org.xpi
1495525030261	addons.xpi	DEBUG	Calling bootstrap method install on e10srollout@mozilla.org version 1.14
1495525030263	addons.xpi-utils	DEBUG	Make addon app-system-defaults:e10srollout@mozilla.org visible
1495525030263	DeferredSave.extensions.json	DEBUG	Save changes
1495525030264	addons.manager	DEBUG	Registering startup change 'installed' for firefox@getpocket.com
1495525030264	addons.xpi	DEBUG	Loading bootstrap scope from C:\Program Files\Mozilla Firefox\browser\features\firefox@getpocket.com.xpi
1495525030267	addons.xpi	DEBUG	Calling bootstrap method install on firefox@getpocket.com version 1.0.5
1495525030267	addons.xpi-utils	DEBUG	Make addon app-system-defaults:firefox@getpocket.com visible
1495525030268	DeferredSave.extensions.json	DEBUG	Save changes
1495525030268	addons.manager	DEBUG	Registering startup change 'installed' for webcompat@mozilla.org
1495525030268	addons.xpi	DEBUG	Loading bootstrap scope from C:\Program Files\Mozilla Firefox\browser\features\webcompat@mozilla.org.xpi
1495525030271	addons.xpi	DEBUG	Calling bootstrap method install on webcompat@mozilla.org version 1.0
1495525030271	addons.xpi-utils	DEBUG	Make addon app-system-defaults:webcompat@mozilla.org visible
1495525030271	DeferredSave.extensions.json	DEBUG	Save changes
1495525030271	addons.xpi-utils	DEBUG	Make addon app-global:{972ce4c6-7e08-4474-a285-3208198ce6fd} visible
1495525030272	DeferredSave.extensions.json	DEBUG	Save changes
1495525030272	addons.xpi	DEBUG	Updating XPIState for {"id":"marionette-popup-bug@avira.com","syncGUID":"{9b66c26d-5122-4671-82a8-b7e373393d7c}","location":"app-profile","version":"1.0.0","type":"webextension","internalName":null,"updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":null,"icon64URL":null,"defaultLocale":{"name":"Marionette Popup bug","description":"Demonstrates a marionette popup bug","creator":"Markus Hartung","developers":null,"translators":null,"contributors":null},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Users\\MARKUS~1.HAR\\AppData\\Local\\Temp\\rust_mozprofile.QqOyGuchKcnG\\extensions\\marionette-popup-bug@avira.com","installDate":1495525029737,"updateDate":1495525029737,"applyBackgroundUpdates":1,"bootstrap":true,"skinnable":false,"size":378,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":true,"hasBinaryComponents":false,"strictCompatibility":true,"locales":[],"targetApplications":[{"id":"toolkit@mozilla.org","minVersion":null,"maxVersion":null}],"targetPlatforms":[],"multiprocessCompatible":true,"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"userPermissions":{"hosts":[],"apis":[],"permissions":[]}}
1495525030272	addons.xpi	DEBUG	getModTime: Recursive scan of marionette-popup-bug@avira.com
1495525030274	addons.xpi	DEBUG	Updating XPIState for {"id":"aushelper@mozilla.org","syncGUID":"{45a76135-6547-4f58-b9ed-07470ff3c004}","location":"app-system-defaults","version":"2.0","type":"extension","internalName":null,"updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":null,"icon64URL":null,"defaultLocale":{"name":"Application Update Service Helper","description":"Sets value(s) in the update url based on custom checks.","creator":null,"homepageURL":null},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\aushelper@mozilla.org.xpi","installDate":1493925665000,"updateDate":1493925665000,"applyBackgroundUpdates":1,"bootstrap":true,"skinnable":false,"size":8488,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":false,"hasBinaryComponents":false,"strictCompatibility":false,"locales":[],"targetApplications":[{"id":"{ec8030f7-c20a-464f-9b0e-13a3a9e97384}","minVersion":"53.0.2","maxVersion":"53.*"}],"targetPlatforms":[],"multiprocessCompatible":true,"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"mpcOptedOut":false,"userPermissions":null}
1495525030274	addons.xpi	DEBUG	getModTime: Recursive scan of aushelper@mozilla.org
1495525030274	addons.xpi	DEBUG	Updating XPIState for {"id":"e10srollout@mozilla.org","syncGUID":"{96d12108-7c2f-4e9c-9667-208043baff4a}","location":"app-system-defaults","version":"1.14","type":"extension","internalName":null,"updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":null,"icon64URL":null,"defaultLocale":{"name":"Multi-process staged rollout","description":"Staged rollout of Firefox multi-process feature.","creator":null,"homepageURL":null},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\e10srollout@mozilla.org.xpi","installDate":1493925665000,"updateDate":1493925665000,"applyBackgroundUpdates":1,"bootstrap":true,"skinnable":false,"size":8478,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":false,"hasBinaryComponents":false,"strictCompatibility":false,"locales":[],"targetApplications":[{"id":"{ec8030f7-c20a-464f-9b0e-13a3a9e97384}","minVersion":"53.0.2","maxVersion":"53.*"}],"targetPlatforms":[],"multiprocessCompatible":true,"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"mpcOptedOut":false,"userPermissions":null}
1495525030274	addons.xpi	DEBUG	getModTime: Recursive scan of e10srollout@mozilla.org
1495525030275	addons.xpi	DEBUG	Updating XPIState for {"id":"firefox@getpocket.com","syncGUID":"{58e045fc-cbf2-4d6c-b074-2c664becf50b}","location":"app-system-defaults","version":"1.0.5","type":"extension","internalName":null,"updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":null,"icon64URL":null,"defaultLocale":{"name":"Pocket","description":"When you find something you want to view later, put it in Pocket.","creator":null,"homepageURL":null},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\firefox@getpocket.com.xpi","installDate":1493925665000,"updateDate":1493925665000,"applyBackgroundUpdates":1,"bootstrap":true,"skinnable":false,"size":913565,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":false,"hasBinaryComponents":false,"strictCompatibility":false,"locales":[],"targetApplications":[{"id":"{ec8030f7-c20a-464f-9b0e-13a3a9e97384}","minVersion":"53.0.2","maxVersion":"53.*"}],"targetPlatforms":[],"multiprocessCompatible":true,"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"mpcOptedOut":false,"userPermissions":null}
1495525030275	addons.xpi	DEBUG	getModTime: Recursive scan of firefox@getpocket.com
1495525030275	addons.xpi	DEBUG	Updating XPIState for {"id":"webcompat@mozilla.org","syncGUID":"{e2ca18b0-3863-4b72-b73e-23450bb704f4}","location":"app-system-defaults","version":"1.0","type":"extension","internalName":null,"updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":null,"icon64URL":null,"defaultLocale":{"name":"Web Compat","description":"Urgent post-release fixes for web compatibility.","creator":null,"homepageURL":null},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Program Files\\Mozilla Firefox\\browser\\features\\webcompat@mozilla.org.xpi","installDate":1493925665000,"updateDate":1493925665000,"applyBackgroundUpdates":1,"bootstrap":true,"skinnable":false,"size":1456,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":false,"hasBinaryComponents":false,"strictCompatibility":false,"locales":[],"targetApplications":[{"id":"{ec8030f7-c20a-464f-9b0e-13a3a9e97384}","minVersion":"53.0.2","maxVersion":"53.*"}],"targetPlatforms":[],"multiprocessCompatible":true,"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"mpcOptedOut":false,"userPermissions":null}
1495525030276	addons.xpi	DEBUG	getModTime: Recursive scan of webcompat@mozilla.org
1495525030276	addons.xpi	DEBUG	Updating XPIState for {"id":"{972ce4c6-7e08-4474-a285-3208198ce6fd}","syncGUID":"{9475296c-4082-4c5f-a91d-bd3603403938}","location":"app-global","version":"53.0.2","type":"theme","internalName":"classic/1.0","updateURL":null,"updateKey":null,"optionsURL":null,"optionsType":null,"aboutURL":null,"icons":{},"iconURL":"chrome://browser/content/default-theme-icon.svg","icon64URL":null,"defaultLocale":{"name":"Default","description":"The default theme.","creator":"Mozilla","homepageURL":null,"contributors":["Mozilla Contributors"]},"visible":true,"active":true,"userDisabled":false,"appDisabled":false,"descriptor":"C:\\Program Files\\Mozilla Firefox\\browser\\extensions\\{972ce4c6-7e08-4474-a285-3208198ce6fd}.xpi","installDate":1493925665000,"updateDate":1493925665000,"applyBackgroundUpdates":1,"skinnable":true,"size":8207,"sourceURI":null,"releaseNotesURI":null,"softDisabled":false,"foreignInstall":false,"hasBinaryComponents":false,"strictCompatibility":true,"locales":[],"targetApplications":[{"id":"{ec8030f7-c20a-464f-9b0e-13a3a9e97384}","minVersion":"53.0.2","maxVersion":"53.0.2"}],"targetPlatforms":[],"seen":true,"dependencies":[],"hasEmbeddedWebExtension":false,"userPermissions":null}
1495525030276	addons.xpi	DEBUG	getModTime: Recursive scan of {972ce4c6-7e08-4474-a285-3208198ce6fd}
1495525030277	DeferredSave.extensions.json	DEBUG	Save changes
1495525030277	addons.xpi	DEBUG	Updating database with changes to installed add-ons
1495525030277	addons.xpi-utils	DEBUG	Updating add-on states
1495525030279	addons.xpi-utils	DEBUG	Writing add-ons list
1495525030284	addons.xpi	DEBUG	Registering manifest for C:\Program Files\Mozilla Firefox\browser\features\aushelper@mozilla.org.xpi
1495525030285	addons.xpi	DEBUG	Calling bootstrap method startup on aushelper@mozilla.org version 2.0
1495525030286	addons.xpi	DEBUG	Registering manifest for C:\Program Files\Mozilla Firefox\browser\features\e10srollout@mozilla.org.xpi
1495525030287	addons.xpi	DEBUG	Calling bootstrap method startup on e10srollout@mozilla.org version 1.14
1495525030288	addons.xpi	DEBUG	Registering manifest for C:\Program Files\Mozilla Firefox\browser\features\firefox@getpocket.com.xpi
1495525030288	addons.xpi	DEBUG	Calling bootstrap method startup on firefox@getpocket.com version 1.0.5
1495525030289	addons.xpi	DEBUG	Calling bootstrap method startup on marionette-popup-bug@avira.com version 1.0.0
1495525030292	addons.xpi	DEBUG	Registering manifest for C:\Program Files\Mozilla Firefox\browser\features\webcompat@mozilla.org.xpi
1495525030293	addons.xpi	DEBUG	Calling bootstrap method startup on webcompat@mozilla.org version 1.0
1495525030295	addons.manager	DEBUG	Registering shutdown blocker for XPIProvider
1495525030296	addons.manager	DEBUG	Provider finished startup: XPIProvider
1495525030296	addons.manager	DEBUG	Starting provider: LightweightThemeManager
1495525030296	addons.manager	DEBUG	Registering shutdown blocker for LightweightThemeManager
1495525030296	addons.manager	DEBUG	Provider finished startup: LightweightThemeManager
1495525030297	addons.manager	DEBUG	Starting provider: GMPProvider
1495525030303	addons.manager	DEBUG	Registering shutdown blocker for GMPProvider
1495525030303	addons.manager	DEBUG	Provider finished startup: GMPProvider
1495525030303	addons.manager	DEBUG	Starting provider: PluginProvider
1495525030304	addons.manager	DEBUG	Registering shutdown blocker for PluginProvider
1495525030304	addons.manager	DEBUG	Provider finished startup: PluginProvider
1495525030304	addons.manager	DEBUG	Completed startup sequence
1495525030620	addons.manager	DEBUG	Starting provider: <unnamed-provider>
1495525030620	addons.manager	DEBUG	Registering shutdown blocker for <unnamed-provider>
1495525030620	addons.manager	DEBUG	Provider finished startup: <unnamed-provider>
1495525030642	addons.manager	DEBUG	Starting provider: PreviousExperimentProvider
1495525030642	addons.manager	DEBUG	Registering shutdown blocker for PreviousExperimentProvider
1495525030642	addons.manager	DEBUG	Provider finished startup: PreviousExperimentProvider
1495525030644	DeferredSave.extensions.json	DEBUG	Starting write
1495525030773	DeferredSave.extensions.json	DEBUG	Write succeeded
1495525030773	addons.xpi-utils	DEBUG	XPI Database saved, setting schema version preference to 19
1495525030795	addons.webextension.marionette-popup-bug@avira.com	WARN	Please specify whether you want browser_style or not in your browser_action options.
1495525031679	Marionette	INFO	Listening on port 55215
[GPU 80600] WARNING: pipe error: 109: file c:/builds/moz2_slave/m-rel-w64-00000000000000000000/build/src/ipc/chromium/src/chrome/common/ipc_channel_win.cc, line 346
Mai 23, 2017 9:37:11 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFORMATION: Detected dialect: W3C
### execute done: newSession
### execute: setTimeout
{implicit=5000}
### execute done: setTimeout
### execute: get
{url=http://www.example.com}
### execute done: get
### execute: mozSwitchToContext
{context=chrome}
### execute done: mozSwitchToContext
### execute: findElement
{using=id, value=marionette-popup-bug_avira_com-browser-action}
### execute done: findElement
### execute: clickElement
{id=80ec8efe-1ae3-440b-a753-9a53547e27e0}
### execute done: clickElement
### execute: findElement
{using=id, value=PanelUI-webext-marionette-popup-bug_avira_com-browser-action-view}
### execute done: findElement
### execute: findChildElement
{id=40ab3ce4-ae43-493c-b2e0-e1b471ed1682, using=tag name, value=browser}
### execute done: findChildElement
### execute: switchToFrame
{id={ELEMENT=8aad2ab9-15b2-4ea9-9be5-dd88134dbcae, element-6066-11e4-a52e-4f735466cecf=8aad2ab9-15b2-4ea9-9be5-dd88134dbcae}}
### execute done: switchToFrame
### execute: findElement
{using=tag name, value=h1}
### execute done: findElement
### execute: isElementDisplayed
{id=ee43f0a3-404b-48a6-a7bd-5b56d206a071}
### execute done: isElementDisplayed
### execute: switchToFrame
{id=null}
### execute done: switchToFrame
### execute: findElement
{using=id, value=marionette-popup-bug_avira_com-browser-action}
### execute done: findElement
### execute: sendKeysToElement
{id=80ec8efe-1ae3-440b-a753-9a53547e27e0, value=[Ljava.lang.CharSequence;@1bb5a082}
### execute done: sendKeysToElement
JavaScript error: chrome://marionette/content/driver.js, line 521: TypeError: be.getTabBrowser is not a function
### execute: findElement
{using=id, value=marionette-popup-bug_avira_com-browser-action}
### execute done: findElement
### execute: isElementDisplayed
{id=80ec8efe-1ae3-440b-a753-9a53547e27e0}
*************************
A coding exception was thrown and uncaught in a Task.

Full message: TypeError: can't access dead object
Full stack:
*************************
*************************
A coding exception was thrown and uncaught in a Task.

Full message: TypeError: can't access dead object
Full stack:
*************************
*************************
A coding exception was thrown in a Promise rejection callback.
See https://developer.mozilla.org/Mozilla/JavaScript_code_modules/Promise.jsm/Promise

Full message: TypeError: can't access dead object
Full stack:
*************************
Marionette threw an error: TypeError: can't access dead object

Exception in thread "main" org.openqa.selenium.WebDriverException: TypeError: can't access dead object
Build info: version: '3.4.0', revision: 'unknown', time: 'unknown'
System info: host: 'LTTW0350', ip: '169.254.244.75', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '1.8.0_101'
Driver info: FirefoxDriver
Capabilities: Not needed.
Session ID: 8117d8f2-2cb2-4950-90de-f7614394468d
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)
	at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)
	at FirefoxDriver.execute(FirefoxDriver.java:33)
	at org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)
	at org.openqa.selenium.remote.RemoteWebElement.isDisplayed(RemoteWebElement.java:313)
	at PopupTest.main(PopupTest.java:50)

Process finished with exit code 1
```
