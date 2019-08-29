package playground.kotlin

class SavedValue(currentValue: String, previousValue: String) {
    private var _currentValue: String = currentValue
    private var _previousValue: String = previousValue

    var currentValue: String
        get() {
            return _currentValue
        }
        set(value) {
            _previousValue = _currentValue
            _currentValue = value
        }

    override fun toString(): String {
        return "SavedValue(_currentValue='$_currentValue', _previousValue='$_previousValue')"
    }
}