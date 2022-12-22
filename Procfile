java -Xmx300m -Xss512k -XX:CICompilerCount=2 -Dfile.encoding=UTF-8 -cp ./target/classes:./target/dependency/* org.artem.bronebot.BroneBotApplication
heroku ps:scale web=1
web: gunicorn appn.wsgi --log-file -