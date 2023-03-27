package web.service;

import org.springframework.ui.ModelMap;

public interface ModelService {

    default ModelMap setModel(ModelMap model) {
        return null;
    }

    default ModelMap setModel(int count, ModelMap model) {
        return null;
    }
}