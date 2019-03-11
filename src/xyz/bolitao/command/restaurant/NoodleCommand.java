package xyz.bolitao.command.restaurant;

class NoodleCommand implements Command {
    private Chef chef;

    NoodleCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookNoodle();
    }
}
