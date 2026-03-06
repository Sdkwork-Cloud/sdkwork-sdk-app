using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContactGroupCreateForm
    {
        public string? Name { get; set; }
        public List<string>? MemberIds { get; set; }
    }
}
