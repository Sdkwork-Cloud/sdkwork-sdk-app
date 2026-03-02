using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CollectionUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? CoverImage { get; set; }
    }
}
