package jslozano.petclinic.services;

import jslozano.petclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
