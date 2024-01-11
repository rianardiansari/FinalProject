Feature: Test Automation Rest Api

    @api
    Scenario: Test get list data normal
        Given prepare url for "GET_LIST_USERS"
        And hit api get list users
        Then validation status code is equals 200
        Then validation response body get list users
        Then validation response json with JSONSchema "get_list_users_normal.json"

    @api
    Scenario: Test get list data user by id
        Given prepare url for "GET_LIST_USER_BY_ID"
        And hit api get list users limit by 1
        Then validation response body get list users limit by 1
        And hit api get list user by id
        Then validation status code is equals 200
        Then validation response body get list user by id

    @api
    Scenario: Test create new user normal
        Given prepare url for "CREATE_NEW_USERS"
        And hit api post create new user
        Then validation status code is equals 200
        Then validation response body post create new user
        Then validation response json with JSONSchema "post_create_new_user_normal.json"

    @api
    Scenario: Test delete user normal
        Given prepare url for "CREATE_NEW_USERS"
        And hit api post create new user
        Then validation status code is equals 200
        Then validation response body post create new user
        And hit api delete new
        Then validation status code is equals 200

    @api
    Scenario: Test update user normal
        Given prepare url for "CREATE_NEW_USERS"
        And hit api post create new user
        Then validation status code is equals 200
        Then validation response body post create new user
        And hit api update data
        Then validation status code is equals 200
        Then validation response body update user

    @api
    Scenario: Test get list of tags
        Given prepare url for "GET_LIST_OF_TAGS"
        And hit api get list of tags
        Then validation status code is equals 200
        Then validation response body get list of tags

