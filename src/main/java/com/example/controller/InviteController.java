package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Invite;
import com.example.repository.InviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://mariage-clemence-nicolas.netlify.app/")
@RestController
@RequestMapping("/api/v1/")
public class InviteController {

    @Autowired
    private InviteRepository inviteRepository;

    // get all invites
    @GetMapping("/test")
    public String test(){
        return "Bonjour";
    }


    // get all invites
    @GetMapping("/invites")
    public List<Invite> getAllInvites(){
        return inviteRepository.findAll(Sort.by(Sort.Direction.ASC, "nom"));
    }

    // Tous les invités par idFamille
    @GetMapping("/invites/famille/{id}")
    public List<Invite> getInviteByIdFamille(@PathVariable Long id) {
        return inviteRepository.findByIdFamille(id);
    }

    // get invite by id rest api
    @GetMapping("/invites/{id}")
    public ResponseEntity<Invite> getInviteById(@PathVariable Long id) {
        Invite invite = inviteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invite not exist with id :" + id));
        return ResponseEntity.ok(invite);
    }

    @PutMapping("/invites/{id}")
    public ResponseEntity<Invite> updateInvite(@PathVariable Long id, @RequestBody Invite inviteDetails){
        Invite updatedInvite = inviteRepository.save(inviteDetails);
        return ResponseEntity.ok(updatedInvite);
    }


    @DeleteMapping("/invites/{id}")
    public Map<String, Boolean> deleteInvite(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Invite invite = inviteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invite not found for this id :: " + id));

        inviteRepository.delete(invite);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
