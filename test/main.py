from flask import Flask, render_template

app = Flask(__name__)


@app.route('/')
def home():
    return render_template('add-cata.html')


app.debug = True
app.run(host='0.0.0.0', port=8001)
