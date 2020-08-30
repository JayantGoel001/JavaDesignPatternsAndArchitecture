class ControllerObserver {
    private ViewObserver view;
    private ModelObserver model;
    public ControllerObserver(ModelObserver model, ViewObserver view) {
        this.model = model;
        this.view = view;
    }
}
