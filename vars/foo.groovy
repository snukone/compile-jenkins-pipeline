// vars/foo.groovy
def call(Closure body) {
    node('windows') {
        body()
    }
}