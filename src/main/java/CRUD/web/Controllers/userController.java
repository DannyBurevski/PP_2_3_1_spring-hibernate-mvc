package CRUD.web.Controllers;

import CRUD.model.Gender;
import CRUD.model.User;
import CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ModelAndView usersPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("usersList", userService.getUsersList());
        return modelAndView;
    }

    @GetMapping("/edit/{userId}")
    public ModelAndView userEditPage(@PathVariable("userId") Long userId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edituser");
        modelAndView.addObject("user", userService.getUser(userId));
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public ModelAndView userEdit(@ModelAttribute("user") User user,
                                 @RequestParam(value = "action") String action) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/users");
        if (action.equals("save")) {
            userService.updateUser(user);
        }
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView userAddPage() {
        User newUser = new User();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("adduser");
        modelAndView.addObject("newuser", newUser);
        modelAndView.addObject("genders", Gender.values());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView userAdd(@ModelAttribute("user") User user,
                                @RequestParam(value = "action") String action) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/users");
        if (action.equals("save")) {
            userService.addUser(user);
        }
        return modelAndView;
    }

    @GetMapping("/delete/{userId}")
    public ModelAndView userDeletePage(@PathVariable("userId") Long userId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("deleteuser");
        modelAndView.addObject("user", userService.getUser(userId));
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.DELETE)
    public ModelAndView userDelete(@ModelAttribute("user") User user,
                                   @ModelAttribute("userId") Long id,
                                   @RequestParam(value = "action") String action) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/users");
        if (action.equals("delete")) {
            user.setId(id);
            userService.deleteUser(user);
        }
        return modelAndView;
    }

}
